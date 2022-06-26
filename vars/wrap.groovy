// vars/buildPlugin.groovy
def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    println("Before body")
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    println(config.name)
    
    // now build, based on the configuration provided
    node {
        echo "${config.name}"
    }
}