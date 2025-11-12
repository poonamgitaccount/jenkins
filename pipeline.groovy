pipeline{
    agent any
    stages{
        stage("pull-stage"){
            steps{
               git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
            }
        }
        stage("build-stage"){
            steps{
                echo "build success"
            }
        }
        stage("test-stage"){
            steps{
                echo "test success"
            }
        }
        stage("deploy-stage"){
            steps{
                echo "deploy success"
            }
        }
    }
}
