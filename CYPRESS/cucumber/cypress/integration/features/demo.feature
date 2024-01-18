Feature: manage login

Background:
Given visit page

Scenario: login
When escribo el usuario "student"
And escribo la contraseña "Password123"
Then hago click en el boton