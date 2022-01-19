import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

    username:string = '';
	transactionList: Object[] = [];

	constructor(private route: ActivatedRoute, private userService: UserService) {
		this.route.params.forEach((params: Params) => {
     		this.username = params['username'];
		});

		this.getPrimaryTransactionList();
	}

	getPrimaryTransactionList() {
		this.userService.getTransactionList(this.username).subscribe(
			res => {
				console.log(JSON.parse(JSON.stringify(res))._body);
        		this.transactionList = JSON.parse(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}

	ngOnInit() {}

}