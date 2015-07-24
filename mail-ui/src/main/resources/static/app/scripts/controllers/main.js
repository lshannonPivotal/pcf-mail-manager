'use strict';

/**
 * @ngdoc function
 * @name mailuiApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the mailuiApp
 */
angular.module('mailuiApp')
  .controller('MainCtrl', function ($scope, RecipientService) {
	  
	  $scope.users = '';
	  
      $scope.users = RecipientService.query().$promise
	    .then(function (result) {
	    	console.log(result);
	        $scope.users = result;
	        console.log($scope.users);
	    })
	    .catch(function (error) {
	        alert('Error: ' + error);
	    })
	    .finally(function () {
	    });
	  
	  this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
