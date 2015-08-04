'use strict';

angular.module('wtfApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


