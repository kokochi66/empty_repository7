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

type car struct {
	Manufacturer string
	Model        string
	Doors        int
}

type items struct {
	Wisdom    []sage
	Transport []car
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

	cdd1 := car{
		Manufacturer: "1-k",
		Model:        "1-kochi",
		Doors:        1,
	}

	cdd2 := car{
		Manufacturer: "2-jj",
		Model:        "2-jj",
		Doors:        2,
	}

	cdd3 := car{
		Manufacturer: "3-cc",
		Model:        "3-cc",
		Doors:        3,
	}

	cdd4 := car{
		Manufacturer: "4-uu",
		Model:        "4-uu",
		Doors:        4,
	}

	bdds := []sage{bdd1, bdd2, bdd3, bdd4}
	cdds := []car{cdd1, cdd2, cdd3, cdd4}

	data := items{
		Wisdom:    bdds,
		Transport: cdds,
	}

	// strcut 배열로도 넣을 수 있다.

	err := tpl.Execute(os.Stdout, data)
	if err != nil {
		log.Fatalln(err)
	}

	// p1 := struct {
	// 	fname string
	// 	lname string
	// }{
	// 	"James",
	// 	"Bond",
	// }
	// struct에 대한 명시적 선언없이 위와같이 바로 생성하는것도 가능하다.
}
