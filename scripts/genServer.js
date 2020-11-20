#!/usr/bin/env node
var argv = require('yargs').argv;

const execSync = require('child_process').execSync;

function sh(command, arguments) {
  execSync(command + " " + arguments, {stdio: 'inherit'});
}

if(argv._ && argv._[0]) {
    sh("mkdir -p", "src/main/java/com/adcubum/bff");
    sh("simple-generator -d dependencies/todo-specs/specs/"+argv._[0]+"/*.service.spec -t scripts/templates/server.tmpl > src/main/java/com/adcubum/bff/BffServer.java", "");
}

else {
  console.log("please give the name of the spec as parameter. e.g. `npm run genserver task` ");

}
