package main

import (
	"log"
	"os"
	"text/template" // html 템플릿을 사용하지 않도록 주의.
)

var tpl *template.Template

func init() {
	tpl = template.Must(template.ParseFiles("tpl.gohtml"))
}

func main() {
	err := tpl.ExecuteTemplate(os.Stdout, "tpl.gohtml", `Release self-foucs; embrace other-focus.`)
	// meaning of life에 42값을 집어넣는다.
	if err != nil {
		log.Fatalln(err)
	}
}
