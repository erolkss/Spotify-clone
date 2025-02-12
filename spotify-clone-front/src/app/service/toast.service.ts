import { Injectable } from '@angular/core';
import { ToastInfo } from './model/toast-info.model';
import { text } from 'stream/consumers';

@Injectable({
  providedIn: 'root'
})
export class ToastService {

  toasts: ToastInfo[] = [];

  show(body: string, type: "SUCCESS" | "DANGER"): void {
    let className;
    if (type === "DANGER") {
      className = 'bg-danger text-light'
    } else {
      className = 'bg-success text-light';
    }
    const toastInfo: ToastInfo = { body, className };
    this.toasts.push(toastInfo);
  }

  constructor() { }
}
