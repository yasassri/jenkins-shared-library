def call(String name = 'human') {
  pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World '
            }
        }
    }
}
}
