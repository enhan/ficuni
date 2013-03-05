/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 05/03/13
 * Time: 09:46
 * To change this template use File | Settings | File Templates.
 */


angular.module('ficuni',[]).
    config(['$routeProvider', function ($routeProvider){
        $routeProvider.
            when('/setup', {templateUrl:'public/partials/setup.html', controller:SetupCtrl})
    } ]);
