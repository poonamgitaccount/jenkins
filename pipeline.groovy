pipeline{
    agent {label 'slave'}
    stages{
        stage("pull-stage"){
            steps{
               git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
            }
        }
        stage("build-stage"){
            steps{
               sh '/opt/maven/bin/mvn clean package'
            }
        }
        stage("test-stage"){
            steps{
                // sh '''/opt/maven/bin/mvn sonar:sonar -Dsonar.projectKey=student-app -Dsonar.host.url=http://13.36.237.198:9000 -Dsonar.login=76e7c672672b80a67d517a5801f2843cb7a8f4cc'''
                withSonarQubeEnv(installationName: 'sonar', credentialsId: 'sonar-cred') {
               
                        
                }
            }
        }
        stage("quality"){
             steps{
                 timeout(10) {
    // some block
                }
                 waitForQualityGate : true
             }       
        }    
        stage("deploy-stage"){
            steps{
                echo "deploy success"
            }
        }
    }
}
