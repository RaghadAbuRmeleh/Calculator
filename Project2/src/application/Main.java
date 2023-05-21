package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Main<T> extends Application {
	TextField tx2;
	CursorStack<String> s = new CursorStack<>();

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			root.setBackground(new Background(new BackgroundFill(Color.AZURE, CornerRadii.EMPTY, Insets.EMPTY)));
			Scene scene = new Scene(root, 450, 550);
			scene.setFill(Color.RED);
			primaryStage.setResizable(false);
			VBox v0 = new VBox();
			primaryStage.setTitle("Calculator");
			TextField tx0 = new TextField();
			tx0.setPrefHeight(60);
			tx0.setBorder(Border.stroke(Color.BLACK));
			TextField tx1 = new TextField();
			tx1.setPrefHeight(60);
			// tx1.setText(s.infixPostfix(tx0.getText()));
			tx1.setBorder(Border.stroke(Color.BLACK));
			tx2 = new TextField();
			tx2.setBorder(Border.stroke(Color.BLACK));
			tx2.setPrefHeight(35);
			v0.getChildren().addAll(tx0, tx1, tx2);
			// v0.setBorder(Border.stroke(Color.BLACK));
			root.setTop(v0);
			v0.setPadding(new Insets(30, 10, 10, 10));
			HBox h0 = new HBox();
			Button sin = new Button("sin");
			sin.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + sin.getText());
			});
			sin.setPrefHeight(30);
			sin.setPrefWidth(59);
			sin.setFont(Font.font(12));
			sin.setStyle("-fx-background-color: THISTLE");
			Button cos = new Button("cos");
			cos.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + cos.getText());
			});
			cos.setPrefHeight(30);
			cos.setPrefWidth(59);
			cos.setFont(Font.font(12));
			cos.setStyle("-fx-background-color: THISTLE");
			Button tan = new Button("tan");
			tan.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + tan.getText());
			});
			tan.setPrefHeight(30);
			tan.setPrefWidth(59);
			tan.setFont(Font.font(12));
			tan.setStyle("-fx-background-color: THISTLE");
			Button rightBracket = new Button("(");
			rightBracket.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + rightBracket.getText());
			});
			rightBracket.setPrefHeight(30);
			rightBracket.setPrefWidth(59);
			rightBracket.setFont(Font.font(12));
			rightBracket.setStyle("-fx-background-color: LIGHTSTEELBLUE");
			Button lefttBracket = new Button(")");
			lefttBracket.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + lefttBracket.getText());
			});
			lefttBracket.setPrefHeight(30);
			lefttBracket.setPrefWidth(59);
			lefttBracket.setFont(Font.font(12));
			lefttBracket.setStyle("-fx-background-color: LIGHTSTEELBLUE");
			Button factorial = new Button("!");
			factorial.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + factorial.getText() + " ");
			});
			factorial.setPrefHeight(30);
			factorial.setPrefWidth(59);
			factorial.setFont(Font.font(12));
			factorial.setStyle("-fx-background-color: THISTLE");
			Button off = new Button("off");

			off.setPrefHeight(30);
			off.setPrefWidth(59);
			off.setFont(Font.font(12));
			off.setStyle("-fx-background-color: WHITESMOKE");

			h0.getChildren().addAll(sin, cos, tan, rightBracket, lefttBracket, factorial, off);
			h0.setSpacing(4);
			HBox h1 = new HBox();
			Button pi = new Button("π");
			pi.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + pi.getText());
			});
			pi.setPrefHeight(45);
			pi.setPrefWidth(59);
			pi.setFont(Font.font(12));
			pi.setStyle("-fx-background-color: THISTLE");
			Button yx = new Button("y^x");
			yx.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + "^" + " ");
			});
			yx.setPrefHeight(45);
			yx.setPrefWidth(59);
			yx.setFont(Font.font(12));
			yx.setStyle("-fx-background-color: THISTLE");
			Button seven = new Button("7");
			seven.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + seven.getText());
			});
			seven.setPrefHeight(45);
			seven.setPrefWidth(59);
			seven.setFont(Font.font(12));
			seven.setStyle("-fx-background-color: POWDERBLUE");
			Button eight = new Button("8");
			eight.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + eight.getText());
			});
			eight.setPrefHeight(45);
			eight.setPrefWidth(59);
			eight.setFont(Font.font(12));
			eight.setStyle("-fx-background-color: POWDERBLUE");
			Button nine = new Button("9");
			nine.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + nine.getText());
			});
			nine.setPrefHeight(45);
			nine.setPrefWidth(59);
			nine.setFont(Font.font(12));
			nine.setStyle("-fx-background-color: POWDERBLUE");
			Button over = new Button("÷");
			over.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + over.getText() + " ");
			});
			over.setPrefHeight(45);
			over.setPrefWidth(59);

			over.setFont(Font.font(12));
			over.setStyle("-fx-background-color: PALETURQUOISE");
			Button minus = new Button("(-)");
			minus.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + minus.getText());
			});
			minus.setPrefHeight(45);
			minus.setPrefWidth(59);
			minus.setFont(Font.font(12));
			minus.setStyle("-fx-background-color: LIGHTSTEELBLUE");
			h1.getChildren().addAll(pi, yx, seven, eight, nine, over, minus);
			h1.setSpacing(4);

			HBox h2 = new HBox();
			Button xsquare = new Button("x^2");
			xsquare.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + "^2" + " ");
			});
			xsquare.setPrefHeight(45);
			xsquare.setPrefWidth(59);
			xsquare.setFont(Font.font(12));
			xsquare.setStyle("-fx-background-color: THISTLE");
			Button rootx = new Button("√x");
			rootx.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + "√" + " ");
			});
			rootx.setPrefHeight(45);
			rootx.setPrefWidth(59);
			rootx.setFont(Font.font(12));
			rootx.setStyle("-fx-background-color: THISTLE");
			Button four = new Button("4");
			four.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + four.getText());
			});
			four.setPrefHeight(45);
			four.setPrefWidth(59);
			four.setFont(Font.font(12));
			four.setStyle("-fx-background-color: POWDERBLUE");
			Button five = new Button("5");
			five.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + five.getText());
			});
			five.setPrefHeight(45);
			five.setPrefWidth(59);
			five.setFont(Font.font(12));
			five.setStyle("-fx-background-color: POWDERBLUE");
			Button six = new Button("6");
			six.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + six.getText());
			});
			six.setPrefHeight(45);
			six.setPrefWidth(59);
			six.setFont(Font.font(12));
			six.setStyle("-fx-background-color: POWDERBLUE");
			Button multiple = new Button("×");
			multiple.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + multiple.getText() + " ");
			});
			multiple.setPrefHeight(45);
			multiple.setPrefWidth(59);
			multiple.setFont(Font.font(12));
			multiple.setStyle("-fx-background-color: PALETURQUOISE");
			Button ca = new Button("CA");
			ca.setOnMouseClicked(e -> {
				tx0.clear();
				tx1.clear();
				tx2.clear();
			});
			ca.setPrefHeight(45);
			ca.setPrefWidth(59);
			ca.setFont(Font.font(12));
			ca.setStyle("-fx-background-color: WHITESMOKE");
			h2.getChildren().addAll(xsquare, rootx, four, five, six, multiple, ca);
			h2.setSpacing(4);

			HBox h3 = new HBox();
			Button ex = new Button("e^x");
			ex.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + "e ^ ");
			});
			ex.setPrefHeight(45);
			ex.setPrefWidth(59);
			ex.setFont(Font.font(12));
			ex.setStyle("-fx-background-color: THISTLE");
			Button ln = new Button("ln");
			ln.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + ln.getText());
			});
			ln.setPrefHeight(45);
			ln.setPrefWidth(59);
			ln.setFont(Font.font(12));
			ln.setStyle("-fx-background-color: THISTLE");
			Button one = new Button("1");
			one.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + one.getText());
			});
			one.setPrefHeight(45);
			one.setPrefWidth(59);
			one.setFont(Font.font(12));
			one.setStyle("-fx-background-color: POWDERBLUE");
			Button two = new Button("2");
			two.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + two.getText());
			});
			two.setPrefHeight(45);
			two.setPrefWidth(59);
			two.setFont(Font.font(12));
			two.setStyle("-fx-background-color: POWDERBLUE");
			Button three = new Button("3");
			three.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + three.getText());
			});
			three.setPrefHeight(45);
			three.setPrefWidth(59);
			three.setFont(Font.font(12));
			three.setStyle("-fx-background-color: POWDERBLUE");
			Button substract = new Button("-");
			substract.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + substract.getText() + " ");
			});
			substract.setPrefHeight(45);
			substract.setPrefWidth(59);
			substract.setFont(Font.font(12));
			substract.setStyle("-fx-background-color: PALETURQUOISE");
			Button c = new Button("ON");
			c.setPrefHeight(45);
			c.setPrefWidth(59);
			c.setFont(Font.font(12));
			c.setStyle("-fx-background-color: WHITESMOKE");

			h3.getChildren().addAll(ex, ln, one, two, three, substract, c);
			h3.setSpacing(4);

			HBox h4 = new HBox();
			Button log = new Button("Log");
			log.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + log.getText());
			});
			log.setPrefHeight(45);
			log.setPrefWidth(59);
			log.setFont(Font.font(12));
			log.setStyle("-fx-background-color: THISTLE");
			Button overx = new Button("1/x");
			overx.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + "1 / ");
			});
			overx.setPrefHeight(45);
			overx.setPrefWidth(59);
			overx.setFont(Font.font(12));
			overx.setStyle("-fx-background-color: THISTLE");
			Button zero = new Button("0");
			zero.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + zero.getText());
			});
			zero.setPrefHeight(45);
			zero.setPrefWidth(59);
			zero.setFont(Font.font(12));
			zero.setStyle("-fx-background-color: POWDERBLUE");
			Button dec = new Button(".");
			dec.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + dec.getText());
			});
			dec.setPrefHeight(45);
			dec.setPrefWidth(59);
			dec.setFont(Font.font(12));
			dec.setStyle("-fx-background-color: PALETURQUOISE");
			Button mod = new Button("%");
			mod.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + mod.getText() + " ");
			});
			mod.setPrefHeight(45);
			mod.setPrefWidth(59);
			mod.setFont(Font.font(12));
			mod.setStyle("-fx-background-color: PALETURQUOISE");
			Button addition = new Button("+");
			addition.setOnMouseClicked(e -> {
				tx0.setText(tx0.getText() + " " + addition.getText() + " ");
			});
			addition.setPrefHeight(45);
			addition.setPrefWidth(59);
			addition.setFont(Font.font(12));
			addition.setStyle("-fx-background-color: PALETURQUOISE");
			Button delete = new Button("<-");
			delete.setOnMouseClicked(e -> {
				String s = tx0.getText();

				if (s.length() > 0) {
					if ((s.length() > 1) && (s.substring(s.length() - 2, s.length()).equals(ln.getText())
							|| s.substring(s.length() - 2, s.length()).equals(pi.getText()))) {
						s = s.substring(0, s.length() - 1);
						tx0.setText(s);
					}
					if ((s.length() > 2) && (s.substring(s.length() - 3, s.length()).equals(sin.getText())
							|| s.substring(s.length() - 3, s.length()).equals(cos.getText())
							|| s.substring(s.length() - 3, s.length()).equals(tan.getText())
							|| s.substring(s.length() - 3, s.length()).equals(log.getText()))) {
						s = s.substring(0, s.length() - 3);
						tx0.setText(s);
					}

					else {
						s = s.substring(0, s.length() - 1);
						tx0.setText(s);
					}
				} else
					System.out.println("NO EQUATION TO DELETE");

			});
			delete.setPrefHeight(45);
			delete.setPrefWidth(59);
			delete.setFont(Font.font(12));
			delete.setStyle("-fx-background-color: WHITESMOKE");
			h4.getChildren().addAll(log, overx, zero, dec, mod, addition, delete);
			h4.setSpacing(4);

			HBox h5 = new HBox();
			Button equal = new Button("=");

			equal.setOnAction(e -> {
				try {
				String str = tx0.getText();
				str = str.replaceAll("Log", "g");
				str = str.replaceAll("Ln", "l");
				str = str.replaceAll("sin", "s");
				str = str.replaceAll("cos", "c");
				str = str.replaceAll("tan", "t");
				str = str.replaceAll("²", "^2");
				str = str.replaceAll("/", "÷");
				str = str.replaceAll("-(-)", "+");
				String postfix = infixPostfix(str);
				String result = postfix;
				postfix = postfix.replaceAll("g", "Log");
				postfix = postfix.replaceAll("l", "Ln");
				postfix = postfix.replaceAll("s", "sin");
				postfix = postfix.replaceAll("c", "cos");
				postfix = postfix.replaceAll("t", "tan");
				tx1.setText(postfix);
				result = result.replaceAll("π", "3.1415926535897932384626433832795");
				result = result.replaceAll("e", "2.7182818284590452353602874713527");
				tx2.setText(PostfixEvaluation(result) + "");
				} catch (Exception exp) {
					tx2.setText("Error!!");
				}
			});

			equal.setPrefHeight(60);
			equal.setPrefWidth(437);
			equal.setFont(Font.font(12));
			equal.setStyle("-fx-background-color: POWDERBLUE");
			h5.getChildren().add(equal);

			VBox v1 = new VBox();
			v1.getChildren().addAll(h0, h1, h2, h3, h4, h5);
			v1.setPadding(new Insets(30, 5, 5, 5));
			v1.setSpacing(4);
			root.setCenter(v1);
			off.setOnAction(e -> {
				sin.setDisable(true);
				cos.setDisable(true);
				tan.setDisable(true);
				rightBracket.setDisable(true);
				lefttBracket.setDisable(true);
				factorial.setDisable(true);
				pi.setDisable(true);
				yx.setDisable(true);
				xsquare.setDisable(true);
				eight.setDisable(true);
				rootx.setDisable(true);
				ex.setDisable(true);
				ln.setDisable(true);
				log.setDisable(true);
				nine.setDisable(true);
				over.setDisable(true);
				seven.setDisable(true);
				four.setDisable(true);
				five.setDisable(true);
				six.setDisable(true);
				overx.setDisable(true);
				multiple.setDisable(true);
				substract.setDisable(true);
				zero.setDisable(true);
				dec.setDisable(true);
				mod.setDisable(true);
				addition.setDisable(true);
				// c.setDisable(true);
				ca.setDisable(true);
				minus.setDisable(true);
				delete.setDisable(true);
				one.setDisable(true);
				two.setDisable(true);
				three.setDisable(true);
				equal.setDisable(true);

			});
			c.setOnAction(e -> {
				sin.setDisable(false);
				cos.setDisable(false);
				tan.setDisable(false);
				rightBracket.setDisable(false);
				lefttBracket.setDisable(false);
				factorial.setDisable(false);
				pi.setDisable(false);
				yx.setDisable(false);
				xsquare.setDisable(false);
				eight.setDisable(false);
				rootx.setDisable(false);
				ex.setDisable(false);
				ln.setDisable(false);
				log.setDisable(false);
				nine.setDisable(false);
				over.setDisable(false);
				seven.setDisable(false);
				four.setDisable(false);
				five.setDisable(false);
				six.setDisable(false);
				overx.setDisable(false);
				multiple.setDisable(false);
				substract.setDisable(false);
				zero.setDisable(false);
				dec.setDisable(false);
				mod.setDisable(false);
				addition.setDisable(false);
				// c.setDisable(false);
				ca.setDisable(false);
				minus.setDisable(false);
				delete.setDisable(false);
				one.setDisable(false);
				two.setDisable(false);
				three.setDisable(false);
				equal.setDisable(false);
				
			});
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			tx2.setText("Error!!");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static int Prec(char c) {
		switch (c) {

		case '+':
		case '-':
			return 2;
		case '×':
		case '÷':
		case '%':

			return 3;

		case '^':
		case 'g':
		case 'l':
		case '!':
		case 'π':
		case '√':
		case 's':
		case 'c':
		case 't':
			return 4;

		}
		return -1;
	}

	public static String infixPostfix(String infix) {
		String postfixRes = "";
		CursorStack<Character> stack = new CursorStack<>();
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			switch (c) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '.':
			case 'π':
			case 'e':

				if (i < infix.length() - 1 && infix.charAt(i + 1) == ' ')
					postfixRes += c + " ";
				else
					postfixRes += c;
				break;
			case '^':
			case 'g':
			case '!':
			case 'l':
			case '√':

			case 'c':
			case 't':
			case 's':

			case '+':
			case '-':
			case '%':
			case '×':
			case '÷':

				while (!stack.isEmpty() && (Prec(c) <= Prec((char) stack.peek())) && !stack.peek().equals("(")) {
					postfixRes += " " + stack.pop();
				}
				postfixRes += " ";
				stack.push(c);
				break;
			case '(':
				stack.push(c);
				break;
			case ')':
				char temp = (char) stack.pop();
				while (temp != '(') {
					postfixRes += " " + temp;
					temp = (char) stack.pop();
				}
				break;
			default:
				break;
			}
		}

		while (!stack.isEmpty()) {
			if (stack.peek() == '(' || stack.peek() == ')') 
				return "Error!!";
			char temp = (char) stack.pop();
			postfixRes += " " + temp;
		}
		return postfixRes;

	}

	private static double factorial(double n) {

		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));

	}

	public static double PostfixEvaluation(String postfix) {

		CursorStack<String> postFixEva = new CursorStack<>();
		String[] tokens = postfix.split(" ");

		double result = 0;
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i] != null && !tokens[i].equals("")) {

				switch (tokens[i]) {

				case "+":
					result = Double.parseDouble((String) postFixEva.pop())
							+ Double.parseDouble((String) postFixEva.pop());
					postFixEva.push(Double.toString(result));
					break;

				case "-":
					result = -Double.parseDouble((String) postFixEva.pop())
							+ Double.parseDouble((String) postFixEva.pop());
					postFixEva.push(Double.toString(result));
					break;
				case "×":
					result = Double.parseDouble((String) postFixEva.pop())
							* Double.parseDouble((String) postFixEva.pop());
					postFixEva.push(Double.toString(result));
					break;

				case "÷":
					double op1 = Double.parseDouble((String) postFixEva.pop());
					double op2 = Double.parseDouble(((String) postFixEva.pop()));
					if (op1 == 0)
						System.out.println("cannot divide by 0");

					else {
						result = op2 / op1;
						postFixEva.push(Double.toString(result));
					}

					break;

				case "%":
					double op11 = Double.parseDouble((String) postFixEva.pop());
					double op22 = Double.parseDouble(((String) postFixEva.pop()));
					result = op22 % op11;
					postFixEva.push(Double.toString(result));
					break;

				case "^":
					double op111 = Double.parseDouble((String) postFixEva.pop());
					double op222 = Double.parseDouble(((String) postFixEva.pop()));
					if (op222 == 'e')
						result = Math.pow(Math.E, op111);
					else
						result = Math.pow(op222, op111);
					postFixEva.push(Double.toString(result));
					break;

				case "√":
					double d = Double.parseDouble((String) postFixEva.pop());
					System.out.println(d);
					if (d > 0)
						result = Math.sqrt(d);
					else
						System.out.println("error");
					postFixEva.push(Double.toString(result));
					break;
				case "s":
					result = Math.sin(Math.toRadians(Double.parseDouble((String) postFixEva.pop())));
					postFixEva.push(Double.toString(result));
					break;
				case "c":
					result = Math.cos(Math.toRadians(Double.parseDouble((String) postFixEva.pop())));
					postFixEva.push(Double.toString(result));
					break;
				case "t":
					result = Math.tan(Math.toRadians(Double.parseDouble((String) postFixEva.pop())));
					postFixEva.push(Double.toString(result));
					break;
				case "l":
					result = Math.log(Double.parseDouble((String) postFixEva.pop()));
					postFixEva.push(Double.toString(result));
					break;
				case "g":
					result = Math.log10(Double.parseDouble((String) postFixEva.pop()));
					postFixEva.push(Double.toString(result));
					break;
				case "!":
					result = factorial(Double.parseDouble((String) postFixEva.pop()));
					postFixEva.push(Double.toString(result));
					break;

				default:
					postFixEva.push(tokens[i]);

				}
			}

		}
		return result = Double.parseDouble((String) postFixEva.pop());
	}
}
