package main

import (
	"log"
	"os"
	"text/template" // html 템플릿을 사용하지 않도록 주의.
)

var tpl *template.Template

type Person struct {
	name string
	age  int
	sex  string
}

func init() {
	tpl = template.Must(template.ParseFiles("tpl.gohtml"))
	// Must가 오류 검사를 해주고, 템플릿을 반환해준다.
	// 오류 검사과정을 생략할 수 있다.
	// Must가 자체적으로 Template과 error를 가져와서, 오류가 있을 경우 처리 해준다.
}

func main() {
	err := tpl.ExecuteTemplate(os.Stdout, "tpl.gohtml", 42)
	// meaning of life에 42값을 집어넣는다.
	if err != nil {
		log.Fatalln(err)
	}
}
