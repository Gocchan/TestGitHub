def gitUrl = "git@GH510S:510S/TestGitHub2.git"
def targetBranch = "master"
def ChocolateJenkins = "git"
pipeline { // Declarative pipelineであることを宣言する
  agent any // 環境の指定（anyなので指定なし）
  tools {
    maven "M3"
  }
  stages{
    stage("checkout git") {
      steps{
        dir("${WORKSPACE}") {
          git url: "${gitUrl}", branch: "${targetBranch}", credentialsId: "${ChocolateJenkins}"
          sh "ls -la"
        }
      }
    }

    stage("Lint") {
      steps{
        dir("${WORKSPACE}") {
          println("TODO: Add lint")
        }
      }
    }

    stage("Unit Test") {
      steps{
        dir("${WORKSPACE}") {
          //withMaven( maven: "M3") {
            sh "mvn test"
          //}
        }
      }
    }

    stage("build") {
      steps{
        dir("${WORKSPACE}") {
          //withMaven( maven: "M3") {
            sh "mvn install"
          //}
        }
      }
    }

    stage("Integration Test") {
      steps{
        dir("${WORKSPACE}") {
          println("TODO: integration test")
        }
      }
    }

    stage("deploy") {
      steps{
        println("deploy delicious chocolate!!")
      }
    }
  }
  post{
    always{
      archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
      cleanWs() // ワークスペース削除？
      echo "========Finish========"
    }
  }
}
