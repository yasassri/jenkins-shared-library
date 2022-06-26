// vars/buildPlugin.groovy
def call(body) {
    // evaluate the body block, and collect configuration into the object
    println("Before body")
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    println("After body")

    // now build, based on the configuration provided
    node {
        echo "${config.name}"
    }
}