def call(String name = 'human') {
  pipeline {
       stages {
           echo "Hello, ${name}."
       }
   } 
}
