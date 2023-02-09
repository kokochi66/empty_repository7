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
	sages := map[string]string{
		"jinu":         "kimjinwoo",
		"leechunhyang": "jjunyangioo",
		"nanayang":     "nayangna",
		"sahyang":      "kumsahyang",
		"jjanu":        "JAJANU",
	}

	// key와 value를 따로 부르는 경우 각각 map의 값을 가져올 수 있다.

	err := tpl.Execute(os.Stdout, sages)
	if err != nil {
		log.Fatalln(err)
	}
}
