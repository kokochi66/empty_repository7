package main

import (
	"log"
	"os"
	"text/template" // html 템플릿을 사용하지 않도록 주의.
)

var tpl *template.Template

func init() {
	tpl = template.Must(template.ParseGlob("templates/*"))
	// Must가 오류 검사를 해주고, 템플릿을 반환해준다.
	// 오류 검사과정을 생략할 수 있다.
	// Must가 자체적으로 Template과 error를 가져와서, 오류가 있을 경우 처리 해준다.
}

func main() {
	err := tpl.Execute(os.Stdout, nil)
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.ExecuteTemplate(os.Stdout, "vespa.gohtml", nil)
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.ExecuteTemplate(os.Stdout, "two.gohtml", nil)
	if err != nil {
		log.Fatalln(err)
	}

	err = tpl.ExecuteTemplate(os.Stdout, "one.gohtml", nil)
	if err != nil {
		log.Fatalln(err)
	}

}
