const cucumber = require('cypress-cucumber-preprocessor').default;
const webpack = require('@cypress/webpack-preprocessor');
const webpackOptions = {
  module: {
    rules: [
      {
        test: /\.feature$/,
        use: [
          {
            loader: '@badeball/cypress-cucumber-preprocessor/webpack',
          },
        ],
      },
    ],
  },
};

module.exports = (on, config) => {
  on('file:preprocessor', webpack({ webpackOptions }));
  on('file:preprocessor', cucumber());
};