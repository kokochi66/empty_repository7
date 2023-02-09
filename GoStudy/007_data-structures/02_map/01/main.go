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

	// map을 단순 range로 반복하는 경우 value 값만 가져오게 된다.

	err := tpl.Execute(os.Stdout, sages)
	if err != nil {
		log.Fatalln(err)
	}
}
