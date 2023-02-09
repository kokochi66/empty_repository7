package main

import (
	"log"
	"os"
	"text/template"
)

var tpl *template.Template

type sage struct {
	Name  string
	Motto string
}

func init() {
	tpl = template.Must(template.ParseFiles("tpl.gohtml"))
}

func main() {
	bdd := sage{
		Name:  "jaewon",
		Motto: "kokochikochi",
	}

	// 변수에다가 박을수도 있다.

	err := tpl.Execute(os.Stdout, bdd)
	if err != nil {
		log.Fatalln(err)
	}
}
