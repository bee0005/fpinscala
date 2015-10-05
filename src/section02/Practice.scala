package section02

object Practice {

	// Practice 2-1.
	def fibonacci(n: Int): Int = {
		def go(n: Int, acc: Int): Int =
			if (n <= 0) acc
			else go(n - 1, n + acc)

		go(n, 0)
	}

	// Practice 2-2.
	def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
		@annotation.tailrec
		def go(n: Int): Boolean = {
			if (n >= as.length - 1) true
			else if (ordered(as(n), as(n + 1)) == false) false
			else go(n + 1)
		}

		go(0)
	}

	// Practice 2-3.
	def curry[A,B,C](f: (A,B) => C): A => B => C = {
		a => b => f(a,b)
	}

	// Practice 2-4.
	def uncurry[A,B,C](f: A => B => C): (A,B) => C = {
		(a,b) => f(a)(b)
	}

	// Practice 2-5.
	def compose[A,B,C](f: B => C, g: A => B): A => C = {
		a => f(g(a))
	}
}
