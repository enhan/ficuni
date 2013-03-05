/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 05/03/13
 * Time: 09:41
 * To change this template use File | Settings | File Templates.
 */



function SetupCtrl($scope, $http) {

    $http.get('internships').success(function(data){
     $scope.internships = data;
     });

    $scope.newInternship = {title: "", description: ""}

    $scope.addInternship = function () {
        $http.post('internships', $scope.newInternship).success(
            function () {
                $http.get('internships').success(function(data){
                    $scope.internships = data;
                });
            }
        ).error(function (data, status) {
                window.alert(status);
            });


    }






}
