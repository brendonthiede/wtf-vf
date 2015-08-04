 'use strict';

angular.module('wtfApp')
    .factory('notificationInterceptor', function ($q, AlertService) {
        return {
            response: function(response) {
                var alertKey = response.headers('X-wtfApp-alert');
                if (angular.isString(alertKey)) {
                    AlertService.success(alertKey, { param : response.headers('X-wtfApp-params')});
                }
                return response;
            },
        };
    });