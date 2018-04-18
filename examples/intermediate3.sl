</
	PUSH 5
	STORE a
	PUSH 9
	STORE b
	PUSH a
	PUSH b
	ADD
	STORE c
	PUSH c
	PUSH 4
	GREATEREQUAL
	</
		PUSH c
		PUSH 0
		NOTEQUALTO
		</
			PUSH 3
			STORE a
			PUSH a
			PUSH 1
			ADD
			STORE k
			PUSH k
			giveout
		/>
		TESTFGOTO 29
		PUSH True
		TESTTGOTO 14
	/> 32
	TESTFGOTO 37
	PUSH True
	TESTTGOTO
	</
		PUSH c
		giveout
	/>
	TESTFGOTO
/>

