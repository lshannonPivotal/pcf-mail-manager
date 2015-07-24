'use strict';

angular.module('RecipientSrvc', [])
    .factory('RecipientService', function ($resource) {

        return $resource('http://localhost:8080/api/v1/recipients');
});