#!/bin/bash
export PATH="/opt/homebrew/bin:$PATH"   # adjust based on `which mvn`
cd "/Users/siteshkumarvishwakarma/Documents/Stuffs/JenkinstTest" || exit
mvn clean install