package main

import (
	"log"
	"os"
	"strings"
	"text/template"
)

var tpl *template.Template

var fm = template.FuncMap{
	"uc": strings.ToUpper,
	"ft": firstThree,
}

type sage struct {
	Name  string
	Motto string
}

// funcMap
// string을 key값, 인터페이스를 value로 갖는 Map
// 모든 타입이 빈 인터페이스여야 함

func init() {
	tpl = template.Must(template.New("").Funcs(fm).ParseFiles("tpl.gohtml"))
	// tpl = template.Must(template.ParseFiles("tpl.gohtml"))
}

func firstThree(s string) string {
	s = strings.TrimSpace(s)
	s = s[:3]
	return s
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
	data := []sage{bdd1, bdd2, bdd3, bdd4}

	err := tpl.Execute(os.Stdout, data)
	if err != nil {
		log.Fatalln(err)
	}

}
