node {
	stage ('SCM checkout'){
		git "https://github.com/Nawlej/MyRepo"
		}
	stage ('Build'){
    	dir("SeleniumDemo") {
	   sh "mvn clean install"
       }
       	dir("SeleniumDemo/target") {
	   sh "java -jar SeleniumDemo-0.0.1-SNAPSHOT.jar"
       }
		}
}