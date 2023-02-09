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
	bdd1 := sage{
		Name:  "jaewon",
		Motto: "kokochikochi",
	}

	bdd2 := sage{
		Name:  "lee",
		Motto: "chunhyang",
	}

	bdd3 := sage{
		Name:  "na",
		Motto: "naynag",
	}

	bdd4 := sage{
		Name:  "ki",
		Motto: "kkuiki",
	}
	bdd := []sage{bdd1, bdd2, bdd3, bdd4}

	// strcut 배열로도 넣을 수 있다.

	err := tpl.Execute(os.Stdout, bdd)
	if err != nil {
		log.Fatalln(err)
	}
}
