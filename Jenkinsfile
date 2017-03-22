#!groovy
node {
   // ------------------------------------
   // -- ETAPA: Compilar
   // ------------------------------------
   stage 'Compilar'
   
   // -- Configura variables
   echo 'Configurando variables'
   def mvnHome = tool 'M3'
   env.PATH = "${mvnHome}/bin:${env.PATH}"
   echo "variable mvnHome mvnHome='${mvnHome}'"
   echo "variable PATH env.PATH='${env.PATH}'"
   
 
   
    // -- Descarga código desde SCM
   echo 'Descargando código de SCM'
   sh 'rm -rf *'
   checkout scm
   
   // -- Compilando
   echo 'Compilando aplicación'
   sh 'cd /var/jenkins_home/workspace/tutorial-jenkins2_master-YFFU3PZNYQGJRXN6C5RD5NX2W7DEJFV5UQWUK4ECYBTFXCMJ656Q'
   sh 'mvn clean compile'
   
   // ------------------------------------
   // -- ETAPA: Test
   // ------------------------------------
   stage 'Test'
   echo 'Ejecutando tests'
  
   
   // ------------------------------------
   // -- ETAPA: Instalar
   // ------------------------------------
   stage 'Instalar '
   echo 'Instala el paquete generado en el repositorio maven'

}
