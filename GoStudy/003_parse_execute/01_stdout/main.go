package main

import (
	"log"
	"os"
	"text/template" // html 템플릿을 사용하지 않도록 주의.
)

func main() {
	tpl, err := template.ParseFiles("tpl.gohtml")
	// ParseFiles에 여러개의 파일을 입력할 수 있음
	// 파일을 파싱하여 저장함. 템플릿과 템플릿에 대한 오류를 함께 반환한다.
	// 템플릿은 포인터를 반환한다. *Template
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.Execute(os.Stdout, nil)
	if err != nil {
		log.Fatalln(err)
	}
}
