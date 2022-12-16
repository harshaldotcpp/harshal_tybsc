class InvalidPassword extends Exception{
     InvalidPassword(String s){
         super(s);
     }
}

class InvalidEmail extends Exception{
    InvalidEmail(String s){
        super(s);
    }
}


class Email{
    String orignal_password = "aamin123";
    String orignal_email = "admin";

    String email;
    String password;

    Email(String email,String password){
        this.email = email; 
        this.password = password; 
    }

    public static void main(String args[]){
        Email em = new Email(args[0],args[1]);           
        int emailValid = 0;
        int passwordvalid = 0;

        if(em.email.equals(em.orignal_email)){ 
                emailValid = 1;
                System.out.println("email is valid");
        }
        else{
            try{
                throw new InvalidEmail("your email is invalid");
            }
            catch(Exception e){
                     System.out.println(e); 
            }
        }

        if(em.password.equals(em.orignal_password)) {
            passwordvalid = 1;
            System.out.println("password is valid");
        }
        else{
            try{
                throw new InvalidPassword("your password is invalid");
            }
            catch(Exception e){
                     System.out.println(e); 
            }

        }


        

    }
}
