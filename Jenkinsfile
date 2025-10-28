pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'javac Calculator.java'
            }
        }

        stage('Input') {
            steps {
                script {
                    // Ask user for input
                    def userInput = input(
                        id: 'UserInput',
                        message: 'Enter two numbers and one operator (+, -, *, /):',
                        parameters: [
                            string(name: 'NUM1', defaultValue: '5', description: 'Enter first number'),
                            string(name: 'NUM2', defaultValue: '3', description: 'Enter second number'),
                            string(name: 'OP', defaultValue: '+', description: 'Enter operator (+, -, *, /)')
                        ]
                    )
                    
                    // Save values to environment variables
                    env.NUM1 = userInput.NUM1
                    env.NUM2 = userInput.NUM2
                    env.OP = userInput.OP
                }
            }
        }

        stage('Run Calculator') {
            steps {
                echo "Running Calculator with inputs: ${env.NUM1}, ${env.NUM2}, ${env.OP}"
                bat "java Calculator ${env.NUM1} ${env.NUM2} ${env.OP}"
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                echo 'Deployment successful! ✅'
            }
        }
    }
}
