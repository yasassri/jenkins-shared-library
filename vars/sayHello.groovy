def call(String name = 'human') {
  pipeline {
       stages {
         stage('Hello') {
            steps {
              echo "Hello, ${name}."
            }
         }
       }
   } 
}
