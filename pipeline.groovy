pipeline{
    agent any
    stages{
        stage("pull-stage"){
            steps{
                echo "pull success"
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
