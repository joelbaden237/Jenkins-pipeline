pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                echo "Using Maven to compile and package the code"
                echo "Test"
            }
        }
        stage("Unit and Integration Tests"){
            steps{
                echo "Using JUnit for unit testing and Selenium for integration testing."
                echo "Test plzx"
            }
        }
         stage("Code Analysis"){
            steps{
                echo "Using SonarQube for code analysis."
            }
         }
         stage("Security Scan"){
            steps{
                echo "Using OWASP to identify vulnerabilities in code."
            }
         }
        stage("Deploy to Staging"){
            steps{
                echo "Deploying the application to AWS EC2 staging server."
            }
         }
         stage("Integration Tests on Staging"){
            steps{
                echo "Running integration tests on the staging environment such as CI/CD Smoke Test."
            }
         }
         stage("Deploy to Production"){
            steps{
                echo "Deploying the application to AWS EC2 production server."
            }
         }
        
    












    }








}
