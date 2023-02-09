package main

import (
	"log"
	"os"
	"text/template" // html 템플릿을 사용하지 않도록 주의.
)

func main() {
	tpl, err := template.ParseFiles("tpl.gohtml")
	if err != nil {
		log.Fatalln(err)
	}

	nf, err := os.Create("index.html")
	// index.html 파일을 만들어낸다.
	if err != nil {
		log.Println("error creating file", err)
	}
	defer nf.Close()

	err = tpl.Execute(nf, nil)
	// tpl 값을 새로생성한 파일 포인터인 nf에 붙여넣기한다.
	if err != nil {
		log.Fatalln(err)
	}
}
