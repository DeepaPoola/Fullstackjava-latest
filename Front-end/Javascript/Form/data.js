
    function validate() {
        let name = document.getElementById("userName").value;
        let email = document.getElementById("userEmail").value;
        let password = document.getElementById("userPassword").value;
        if (name == "") {
            document.getElementById("message").innerHTML = `Please Enter Value`
            /*  let tag_Ref = document.getElementById("message");
             console.log(tag_Ref) */
            return false;
        }
        if (name.length < 6) {
            document.getElementById("message").innerHTML = "Min 6 Char"
            return false;
        }

        if (email == "") {
            document.getElementById("emailMessage").innerHTML = "Please Enter Email";
            return false
        }
        let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if (email.match(regexEmail)) {
            return false;
        } else {
            document.getElementById("emailMessage").innerHTML = "Please Enter Proper Email";
            return false;
        }
        if (password == "" || password.length < 6) {
            document.getElementById("passwordMessage").innerHTML = "Please Enter Proper Password & Min 6 Char"
            return false
        }


        /*let user = { name: "", email: "", password: "" }
        user.name = name;
        user.email = email;
        user.password = password;*/
        //console.log(user);
        //alert(JSON.stringify(user))


    }

