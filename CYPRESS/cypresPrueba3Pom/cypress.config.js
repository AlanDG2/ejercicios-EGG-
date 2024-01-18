const { defineConfig } = require('cypress');
const createBundler = require('@bahmutov/cypress-esbuild-preprocessor');
const preprocessor = require('@badeball/cypress-cucumber-preprocessor');
const createEsbuildPlugin = require('@badeball/cypress-cucumber-preprocessor/esbuild');
const webpack = require('webpack');

async function setupNodeEvents(on, config) {
  await preprocessor.addCucumberPreprocessorPlugin(on, config);

  on(
    'file:preprocessor',
    createBundler({
      plugins: [
        createEsbuildPlugin.default(config),
        new webpack.DefinePlugin({
          process: JSON.stringify({}),
        }),
      ],
    })
  );

  // Make sure to return the config object as it might have been modified by the plugin.
  return config;
}

module.exports = defineConfig({
  e2e: {
    specPattern: '**/*.feature',
    supportFile: false,
    setupNodeEvents,
  },
  "cypress-cucumber-preprocessor": {
    "nonGlobalStepDefinitions": true,
    "stepDefinitions": "cypress/e2e/features"
  }
});

