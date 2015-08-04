'use strict';

angular.module('wtfApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
