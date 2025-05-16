pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                echo "Building ..."
            }
            post{
                always{
                    mail to: "jbaden777@gmail.com",
                    subject: "Build Status Email",
                    body: "Build Log Attached!"

                }
            }

        }
        stage("Test"){
            steps{
                echo "Testing..."
            }



        }
         stage("Deploy"){
            steps{
                echo "Deploying..."
            }













    }








}