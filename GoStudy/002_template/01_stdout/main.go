package main

import "fmt"

func main() {
	name := "Todd McLeod"

	tpl := `
		<!DOCTYPE html>
		<html lang="en">
		<head>
		<meta charset="UTF-8">
		<title>Hello World!</title>
		</head>
		<body>
		<h1>` + name + `</h1>
		</body>
		</html>
	`

	fmt.Println(tpl)
	// print 되는 값을 go run main.go > index.html 명령어를 사용하면 파이프라인으로 파일이 생성된다.
}
