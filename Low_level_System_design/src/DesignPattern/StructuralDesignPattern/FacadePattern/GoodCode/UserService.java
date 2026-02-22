package DesignPattern.StructuralDesignPattern.FacadePattern.GoodCode;

//Microservice for User management
public class UserService {

    public String getUserDetails(String userId){
        return "User details for userId: "+ userId;
    }
}
