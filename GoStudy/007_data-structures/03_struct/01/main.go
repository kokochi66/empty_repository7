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

	// struct는 필드 이름으로 접근해서 바로 값을 가져올 수 있다.

	err := tpl.Execute(os.Stdout, bdd)
	if err != nil {
		log.Fatalln(err)
	}
}
