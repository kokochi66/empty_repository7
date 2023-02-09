package main

import (
	"log"
	"os"
	"text/template"
)

var tpl *template.Template

func init() {
	tpl = template.Must(template.ParseFiles("tpl.gohtml"))
}

func main() {
	sages := []string{"jinu", "leechunhyang", "nanayang", "sahyang", "jjanu"}

	// range에 index와 element를 가져와서 변수로 사용할 수도 있다.

	err := tpl.Execute(os.Stdout, sages)
	if err != nil {
		log.Fatalln(err)
	}
}
