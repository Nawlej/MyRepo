node {
	stage ('SCM checkout'){
		git "https://github.com/Nawlej/MyRepo"
		}
	stage ('Build'){
    	dir("SeleniumDemo") {
	   sh "mvn clean install"
       }

		}
}

