#!/usr/bin/env node


const fs = require('fs');
const execSync = require('child_process').execSync;
const path = require('path');

function sh(command, arguments) {
  execSync(command + " " + arguments, {stdio: 'inherit'});
}

// clean the build folder
sh("rm -rf", "build/*");
sh("rm -rf", "src/*");

sh("node_modules/@furo/specs/_scripts/build.js", "");
