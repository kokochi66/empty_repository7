package main

import "fmt"

var x int

// 같은 패키지 내에서는 모두 사용할 수 있는 전역변수

type person struct {
	fname  string // 소문자로 만들 경우 패키지 밖에서 변수명이 보이지 않는다.
	Pfname string // 대문자로 만들면 패키지 밖에서도 필드가 보인다.
	lname  string
}

type secretAgent struct {
	person
	licenseToKill bool
}

func main() {
	x := 7
	fmt.Println(x)
	// 일반 정수에 값 넣기

	xi := []int{2, 4, 7, 8, 42}
	fmt.Println(xi)
	// 배열 만들기

	m := map[string]int{
		"todd":    45,
		"job":     42,
		"kokochi": 26,
	}
	// map을 생성하기 => 키워드를 변수명으로는 사용할 수 없다.
	fmt.Println(m)

	p1 := person{
		// 값을 순서대로 넣어주면 된다.
		"john", "kokochi", "jaewon",
	}
	fmt.Println(p1)

	p1.speak()

	sal := secretAgent{
		person{
			"Gambler", "Huh", "Jinwoo",
		},
		true,
	}
	sal.speak()
	sal.person.speak()

	saySomething(p1)
	saySomething(sal)
	// 명시적 선언 없이, 하위 객체들이 같은 속성을 갖고있다면 해당 속성을 사용할 수 있다.
	// 같은 속성을 갖고있지 않으면 오류가 발생한다.
}

// 함수 형태
// func (receiver) identifier (parameters) (returns) {code}
func (p person) speak() {
	fmt.Println(p.fname, p.lname, `says, "Good morning, James"`)
}

// recevier를 달아주면서, struct 내부에 해당 함수가 있는 것처럼 사용할 수 있다.

func (sa secretAgent) speak() {
	fmt.Println(sa.fname, sa.lname, `says, "Loud speak"`)
}

type human interface {
	speak()
}

func saySomething(h human) {
	h.speak()
}
