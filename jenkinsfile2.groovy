pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                echo "Building ..."
            }
            post{
                sucess{
                    mail to: "jbaden777@gmail.com",
                    subject: "Build Status Email",
                    body: "Build was successful!"

                }
            }



        }













    }








}