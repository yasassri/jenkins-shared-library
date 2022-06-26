// vars/buildPlugin.groovy
def call(Closure body) {
    
    println("In the Block")
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    // Do something
    node {
        echo "${config.imageName}"
    }

    // return something 
    return "Return String!!!!"
}