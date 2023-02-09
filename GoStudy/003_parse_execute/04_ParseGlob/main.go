package main

import (
	"log"
	"os"
	"text/template" // html 템플릿을 사용하지 않도록 주의.
)

func main() {
	tpl, err := template.ParseGlob("templates/*.gohtml")
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.Execute(os.Stdout, nil)
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.ExecuteTemplate(os.Stdout, "vespa.gohtml", nil)
	// tpl은 템플릿을 보유하는 하나의 컨테이너라고 볼 수 있다.
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.ExecuteTemplate(os.Stdout, "two.gohtml", nil)
	// tpl은 템플릿을 보유하는 하나의 컨테이너라고 볼 수 있다.
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.ExecuteTemplate(os.Stdout, "one.gohtml", nil)
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.Execute(os.Stdout, nil)
	if err != nil {
		log.Fatalln(err)
	}
	// 맨 처음 넣었던 ONE을 다시 찾아서 가져온다.

}
