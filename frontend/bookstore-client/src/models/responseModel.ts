export interface ResponseModel<T> {
  code: number;
  data: T;
  status: string;
}
