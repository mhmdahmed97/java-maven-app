pipeline {
    agent any
    
    parameters{
        choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: 'Version description NULL')
        booleanParam(name:'executeTests', defaultValue: true, description: 'boolean param desc is NULL')
    }
    stages {
        stage("build") {
            steps {
                echo "building the application ..."
            }
        }
        stage("test") {
        		when {
        			expression {
        				//BRANCH_NAME == 'dev' || BRANCH_NAME == 'main'
                        params.executeTests
        			}
        		}
        		steps{
        		
                echo "testing the application ..."
            }
        }
         stage("deploy") {
            steps {
                echo "deploying the application ..."
                echo "deploying version ${params.VERSION}"
            }
        }
    }   
}
